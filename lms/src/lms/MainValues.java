/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hashan
 */
public class MainValues {

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }


    private String department;
    private String course;
    private int UserID;
    private String UserRole;
    private String UserFullName;
    private String filePath;
    private String year;
    
    /**
     *
     * @param id
     * @throws SQLException
     */
    public void userInfo(int id) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection conn = DBConnect.getConnection();
        try{
            stmt =conn.prepareStatement("select * from users where user_id = ?");
            stmt.setInt(1, id);
            rs= stmt.executeQuery();
            rs.next();
            String name=rs.getString("user_fullname");
            String role=rs.getString("role");
            this.UserFullName= name;
            this.UserRole=role;
            System.out.println("***********mainvalue test**************/nuserID:"+id);
        }catch(SQLException e){
            System.err.println("error: "+e);
        } finally{
            if(rs != null){
                rs.close();
            }
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }
    }
    
    
    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


        /**
     * @return the UserFullName
     */
    public String getUserFullName() {
        return UserFullName;
    }

    /**
     * @param UserFullName the UserFullName to set
     */
    public void setUserFullName(String UserFullName) {
        this.UserFullName = UserFullName;
    }


        /**
     * @return the UserID
     */
    public int getUserID() {
        return UserID;
    }

    /**
     * @param UserID the UserID to set
     */
    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    /**
     * @return the UserRole
     */
    public String getUserRole() {
        
        return UserRole;
    }

    /**
     * @param UserRole the UserRole to set
     */
    public void setUserRole(String UserRole) {
        this.UserRole = UserRole;
    }

        /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     *
     * @param dept
     */
    public void setDepartment(String dept){
        this.department=dept;
    }

    /**
     *
     * @return
     */
    public String getDepartment(){
        return department;
    }
}
