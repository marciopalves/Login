
public class Autenticador {

	public Usuario logar(String login, String senha) throws LoginException{
		if(login.equals("marcio") && senha.equals("123456")){
			return new Usuario(login);
		}else {
			throw new LoginException("Usu�rio e senha n�o confere", login);
		}
		
	}
}
