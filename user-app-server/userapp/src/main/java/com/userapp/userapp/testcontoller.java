package com.userapp.userapp;

//import java.util.HashMap;
//import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
// import java.sql.*;

@RestController
public class testcontoller {
    
@GetMapping("/welcome")
    public String new_api(){
        return "welcome";
    }
    // @PostMapping("/account")
    // public void createAccount(){
    //     try{
    //         Map<String, String> params = new HashMap<String, String>();
    //         params.put("username","shk");

    //         String url = "";
	// 		String uname = "";
	// 		String pass = "";
	// 		String query = "";
	// 		String updateQuery = "insert into user  values ";
	// 		Class.forName("com.mysql.jdbc.Driver");
	// 		Connection con = DriverManager.getConnection(url, uname, pass);
	// 		Statement st = con.createStatement();
	// 		ResultSet rs = st.executeQuery(query);
	// 		int count = st.executeUpdate(updateQuery);
	// 		while(rs.next()){
	// 			String userData = rs.getInt(1) + ":" + rs.getString(2);

	// 		}
	// 		st.close();
	// 		con.close();
            
    //     } catch (ClassNotFoundException | SQLException e) {
	// 		e.printStackTrace();
	// 	}
        
    // }

}
