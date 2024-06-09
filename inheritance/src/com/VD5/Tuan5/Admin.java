package com.VD5.Tuan5;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Admin extends User {
	private List<String> permissions ;
	 public Admin() {
	        super();
	        this.permissions = new ArrayList<>();
	    }
	 public Admin(String userld, String username, String password, String email, List<String> permissions) {
	        super(userld, username, password, email);
	        this.permissions = permissions;
	    }
	 public List<String> getPermissions() {
	        return permissions;
	    }

	    public void setPermissions(List<String> permissions) {
	        this.permissions = permissions;
	    }@Override
	    public String toString() {
	        return "Admin [userld=" + getUserld() + ", username=" + getUsername() + ", password=" + getPassword()
	                + ", email=" + getEmail() + ", permissions=" + permissions + "]";
	    }
	    @Override
	    public void input() {
	        super.input();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter permissions (separated by commas): ");
	        String permissionsInput = scanner.nextLine();
	        String[] permissionsArray = permissionsInput.split(",");
	        Collections.addAll(permissions, permissionsArray);
	    }
	    
	}
