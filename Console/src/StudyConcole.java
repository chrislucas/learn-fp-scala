import java.io.Console;

public class StudyConcole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*
	     * http://www.juliocnsouza.com.br/java-io-classe-console/
	     * https://twitter.github.io/scala_school/basics.html
         * Se a JVM � invocada indiretamente pela IDE, ou se a JVM � invocada a
         * partir de um processo de background, ent�o o chamada de m�todo
         * System.console () ir� falhar e retornar nulo.
         */
		Console console = System.console();
		if(console != null)
			console.printf("%d\n", 0xff10aa);
	}

}
