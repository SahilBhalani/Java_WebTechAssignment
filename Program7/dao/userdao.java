package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.User;

public class userdao {
	Connection cn = null;

	public userdao() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/program_07", "root", "");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int adduser(User user) {

		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into pro_07 values (?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, user.getFname());
			ps.setString(3, user.getLname());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getMobile());
			ps.setString(6, user.getGender());
			ps.setString(7, user.getPass());

			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public ArrayList<User> viewalluser() {
		ArrayList<User> user = new ArrayList<User>();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from pro_07");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User us = new User();
				us.setId(rs.getInt(1));
				us.setFname(rs.getString(2));
				us.setLname(rs.getString(3));
				us.setEmail(rs.getString(4));
				us.setMobile(rs.getString(5));
				us.setGender(rs.getString(6));
				us.setPass(rs.getString(7));

				user.add(us);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}

	public int deleteuser(int id) {

		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("delete from pro_07 where id=?");
			ps.setInt(1, id);

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public User getalluser(int id) {

		User user = new User();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from pro_07 where id=?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				user.setId(rs.getInt(1));
				user.setFname(rs.getString(2));
				user.setLname(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setMobile(rs.getString(5));
				user.setGender(rs.getString(6));
				user.setPass(rs.getString(7));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}

	public int updateuser(User user) {

		int i = 0;

		try {
			PreparedStatement ps = cn
					.prepareStatement("update pro_07 set fname=?,lname=?,email=?,mobile=?,gender=?,pass=? where id=?");
			ps.setInt(7, user.getId());
			ps.setString(1, user.getFname());
			ps.setString(2, user.getLname());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getMobile());
			ps.setString(5, user.getGender());
			ps.setString(6, user.getPass());

			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public ArrayList<User> deleted_data() {

		ArrayList<User> user = new ArrayList<User>();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from delete_user");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User u = new User();
				u.setId(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setMobile(rs.getString(5));
				u.setGender(rs.getString(6));
				u.setPass(rs.getString(7));

				user.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}

}
