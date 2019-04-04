package Facebook;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	//Declarar facebook geral para usar em todas as funções	
	 static Facebook facebook = new Facebook();
	 static User user1 = new User();
	
	public static void menu() {
		  
	}
	
	public static void homepage() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*********************************");
		System.out.println("************ Facebook ***********");
		System.out.println("*********************************");
		System.out.println("**  1. Registar                **");
		System.out.println("**  2. Login                   **");
		System.out.println("**  3. Admininstrador          **");
		System.out.println("*********************************");
		
		String input = br.readLine();
		
		switch(input) {
		case "1" : 
				registar();
			break;
	
		case "2" : 
			login();
		break;
		
		case "3":
			administrador();
			break;
		default: 
			break;
		}

		
	}
	
	public static void registar() throws IOException{
		String nome;
		String email;
		String password;
		String confirmPassword;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*********************************");
		System.out.println("************ Registar ***********");
		System.out.println("*********************************");
		
		System.out.println("Introduza o nome: ");		
		nome = br.readLine();
		
		System.out.println("Introduza o email: ");
		email = br.readLine();
		
		do  {			
			System.out.println("Introduza a password: ");
			password = br.readLine();
			
			System.out.println("Confirme a password: ");
			confirmPassword = br.readLine();
			
		}while(!Objects.equals(confirmPassword, password));
		
		facebook.register(nome, email, password);
		user1.setName(nome);
		user1.setEmail(email);
		user1.setPassword(password);
		loggedInMenu();
		br.close();
	}	
	
	public static void login() throws IOException {
	
		String email;
		String password;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		System.out.println("Introduza o email: ");
		email = br.readLine();

		if(facebook.getUserByEmail(email) == null) {
			System.out.println("Introduziu um email errado!");
			login();
		}
		
		System.out.println("Introduza a password: ");
		password = br.readLine();
		
		facebook.login(email,password);  
		System.out.println("You are now logged in!");
		user1 = facebook.getUserByEmail(email);
		loggedInMenu();
	}
	
	public static void changePassword() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		String password;
		String newPassword;
		String newConfirmPassword;
		
		do {System.out.println("Introduza a password atual:");
		password = br.readLine();
		System.out.println("Introduza a nova password:");
		newPassword = br.readLine();
		System.out.println("Confirme a nova password:");
		newConfirmPassword = br.readLine();
		}while(!Objects.equals(newConfirmPassword, newPassword));
		
		user1.setPassword(newConfirmPassword);
		System.out.println("Password alterada com sucesso!");
		menuProfile();
		
	}
	
	public static void changeName() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		  String name;
		  
		  System.out.println("Introduza o novo nome");
		  
		  name = br.readLine();
		  
		  user1.setName(name);
		  System.out.println("Nome alterado com sucesso!");
		  
	}
	
	public static void administrador() throws IOException {
	      System.out.println("Lista de Utilizadores");

		
		  for (Iterator iterator__ = facebook.getUsers().iterator(); iterator__.hasNext(); ) {
		      User user1 = (User) iterator__.next();
		      System.out.print(user1.getName());
		      System.out.print(" com o email: ");
		      System.out.println(user1.getEmail());
		      }
		  System.in.read();
		  homepage();
	}
	
	
	public static void postMenu(User user1) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("***********Adiciona um Post***********\n\n");
		System.out.println("Introduza a descrição\n");
		String description = br.readLine();
		System.out.println("Introduza a data, ano -> mes -> dia -> hora -> minuto -> segundo espacados por um Enter\n");
		   String yr = br.readLine();		   
		   String mnth = br.readLine();
		   String d = br.readLine();
		   String hrs = br.readLine();
		   String mnts = br.readLine();
		   String scnd = br.readLine();
		   
		   int iyr, imnth, id, ihrs, imnts, iscnd;
		   
		   iyr = Integer.parseInt(yr);
		   imnth = Integer.parseInt(mnth);
		   id = Integer.parseInt(d);
		   ihrs = Integer.parseInt(hrs);
		   imnts = Integer.parseInt(mnts);
		   iscnd = Integer.parseInt(scnd);
		   
		  
		Date date = new Date(iyr, imnth, id, ihrs, imnts, iscnd);
		   
		System.out.println("Introduza a privacidade do Post:\n\n 0 - Publico\n 1 - Amigos\n 2 - Melhores amigos\n");
		String privacy = br.readLine();
		int iprivacy = Integer.parseInt(privacy);

	user1.addPost(new Post(description, date, iprivacy));
	loggedInMenu();
	}
	
	public static void menuProfile() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("**************************");
		System.out.println("**********Perfil**********");
		System.out.println("**************************");
		System.out.println("Por favor, introduza um número correspondente às seguintes opções:");
		System.out.println("1 - Ver os meus posts");
		System.out.println("2 - Ver os meus amigos");
		System.out.println("3 - Ver os meus melhores amigos");
		System.out.println("4 - Alterar a Password");
		System.out.println("5 - Alterar o email");
		System.out.println("6 - Voltar atras");
		
		String input = br.readLine();

		switch(input) {
		case "1" : 
			user1.getFeed().getMyPosts(user1); 
			System.in.read();
			menuProfile();
			break;
		case "2" : 
			System.out.println("Lista de amigos\n");
			for (Iterator iterator_ = user1.getFriends().iterator(); iterator_.hasNext(); ) {
			      User user1 = (User) iterator_.next();
				System.out.println(user1.getName());
			}	
			System.in.read();
			menuProfile();
			break;
		case "3":
			System.out.println("Lista de melhores amigos\n");
			for (Iterator iterator_ = user1.getBestFriends().iterator(); iterator_.hasNext(); ) {
			      User user1 = (User) iterator_.next();
				System.out.println(user1.getName());
			}
			System.in.read();
			break;
			
		case "4":
			changePassword();
			menuProfile();
			break;
			
		case "5":
			changeName();
			menuProfile();
			break;
			
		case "6":
			loggedInMenu();
			break;
			
		}
		
	}
	
	
	public static void loggedInMenu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("**************************");
		System.out.println("***********Menu***********");
		System.out.println("**************************");
		System.out.println("Por favor, introduza um número correspondente às seguintes opções:");
		System.out.println("1 - Consultar feed de notícias");
		System.out.println("2 - Consultar o meu perfil");
		System.out.println("3 - Elaborar um post");
		System.out.println("4 - Adicionar amigo");
		System.out.println("5 - Remover amigo");
		System.out.println("6 - Promover amigo a melhor amigo");
		System.out.println("7 - Despromover melhor amigo a amigo");
		System.out.println("0 - Efetuar log out");
		
		String input = br.readLine();

			
		switch(input) {
		case "1" : 
			user1.getFeed().getAllVisiblePostsForMe(facebook,user1);
			System.in.read();
			loggedInMenu();
			break;
		case "2" : 
			menuProfile();
			System.in.read();
			loggedInMenu();
			break;
		case "3" : 
			postMenu(user1);
			System.in.read();
			loggedInMenu();
			break;
		case "4" : 
			String email;
			do{
			System.out.println("Adicionar um amigo\n");
			System.out.println("Introduza o email do amigo que pretende adicionar\n");
			email = br.readLine();
			}while(facebook.getUserByEmail(email) == null);
				
			user1.addFriend(facebook.getUserByEmail(email));
			loggedInMenu();
		break;
		case "5" : 
			String emailRm;
			do{
			System.out.println("Remover um amigo\n");
			System.out.println("Introduza o email do amigo que pretende remover\n");
			emailRm = br.readLine();
			}while(facebook.getUserByEmail(emailRm) == null);
			
			user1.removeFriend(facebook.getUserByEmail(emailRm));
			loggedInMenu();			
			break;
		case "6" : 
			System.out.println("Promover amigo a melhor amigo\n");
			System.out.println("Introduza o email do amigo que pretende promover\n");
			String emailToPromove = br.readLine();
			if(facebook.getUserByEmail(emailToPromove) == null) {
				System.out.println("Introduziu um email errado!");
			}
			user1.addBestFriend(facebook.getUserByEmail(emailToPromove));
			System.in.read();
			loggedInMenu();			
			break;
		case "7" : 
			System.out.println("Despromover melhor amigo a amigo\n");
			System.out.println("Introduza o email do amigo que pretende despromover\n");
			String emailToDespromove = br.readLine();
			if(facebook.getUserByEmail(emailToDespromove) == null) {
				System.out.println("Introduziu um email errado!");
			}
			user1.removeBestFriend(facebook.getUserByEmail(emailToDespromove));
			System.in.read();
			loggedInMenu();			
			break;
		case "0" : 
			facebook.logoff(user1.getEmail());
			homepage();
			break;
			
		default: 
			System.out.println("Opçao invalida, por favor escolha um numero valido\n");
			loggedInMenu();
			break;
		}
	}
	
	public static void fillDatabase() {
		User user2 = new User();
		User user3 = new User();
		
		user2.setName("test2");
		user2.setEmail("test2");
		user2.setPassword("pass");
		
		user3.setName("test3");
		user3.setEmail("test3");
		user3.setPassword("pass");
		
		facebook.register(user2.getName(), user2.getEmail(), user2.getPassword());
		facebook.register(user3.getName(), user3.getEmail(), user3.getPassword());
		
	}
	
	public static void main(String[] args) throws IOException{
		fillDatabase();
		homepage();
		
	  }

}
