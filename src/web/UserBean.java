package web;
import metier.User;
import java.util.Vector;

public class UserBean {
 private User user  = new User();
 private Vector<User>  vecteur = new Vector<User>();
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Vector<User> getVecteur() {
	return vecteur;
}
public void setVecteur(Vector<User> vecteur) {
	this.vecteur = vecteur;
}
 
 
}
