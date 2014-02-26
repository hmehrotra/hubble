package models;

import play.db.ebean.Model;
/**
 * Model class for user login details
 * @author Harshit Mehrotra
 * Date: Frb 24, 2014
 */
public class LoginCredentials extends Model{
    public String userId;
    public String password;
}