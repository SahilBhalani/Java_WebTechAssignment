package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.user;

public class userdao {

	Connection cn = null;

	public userdao() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/program_06", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int reguser(user u) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into pro_06 values (?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, u.getFname());
			ps.setString(3, u.getLname());
			ps.setString(4, u.getMobile());
			ps.setString(5, u.getEmail());
			ps.setString(6, u.getPass());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public ArrayList<user> viewuser() {
		ArrayList<user> user = new ArrayList<user>();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from pro_06");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				user u = new user();
				u.setId(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setMobile(rs.getString(4));
				u.setEmail(rs.getString(5));
				u.setPass(rs.getString(6));

				user.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}

	public int deleteuser(int id) {
		int i=0;
		
		try {
			PreparedStatement ps=cn.prepareStatement("delete from pro_06 where id=?");
			ps.setInt(1, id);
			
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	public user getalluserbyid(int id) {
		user user=new user();
		
		try {
			PreparedStatement ps=cn.prepareStatement("select * from pro_06 where id=?");
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				user.setId(rs.getInt(1));
				user.setFname(rs.getString(2));
				user.setLname(rs.getString(3));
				user.setMobile(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setPass(rs.getString(6));
			}
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	public int updateuser(user u) {
		int i=0;
		
		try {
			PreparedStatement ps=cn.prepareStatement("update pro_06 set fname=?,lname=?,mobile=?,email=?,pass=? where id=? ");
			ps.setString(1,u.getFname());
			ps.setString(2, u.getLname());
			ps.setString(3, u.getMobile());
			ps.setString(4, u.getEmail());
			ps.setString(5, u.getPass());
			ps.setInt(6, u.getId());
			
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

}
