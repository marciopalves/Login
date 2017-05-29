
public class Autenticador {

	public Usuario logar(String login, String senha) throws LoginException{
		if(login.equals("marcio") && senha.equals("123456")){
			return new Usuario(login);
		}else {
			throw new LoginException("Usuário e senha não confere", login);
		}
		
	}
}
