import java.io.Console;

public class StudyConcole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*
	     * http://www.juliocnsouza.com.br/java-io-classe-console/
	     * https://twitter.github.io/scala_school/basics.html
         * Se a JVM é invocada indiretamente pela IDE, ou se a JVM é invocada a
         * partir de um processo de background, então o chamada de método
         * System.console () irá falhar e retornar nulo.
         */
		Console console = System.console();
		if(console != null)
			console.printf("%d\n", 0xff10aa);
	}

}
