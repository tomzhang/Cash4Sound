package us.example.bwnllc.cash4sounds

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = stringFromJNI()
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val yes = "Y"
        val input = Scanner(System.`in`)
        println("Welcome to Cash4Sound - The Transpaent Microphone: We Listen, You Earn")
        println("Please login or create an account. Do you have a login? (Y/n)")
        val login = input.nextLine()
        while (login === yes) {
            print("Please enter your email address.")
            val email = input.nextLine()
            println("Please enter your password.")
            val userPassword = input.nextLine()
            //Load UI
            //if(userPassword == dbPassword){
            //  System.out.println("Welcome back!");
            //}

        }
        println("Please enter your first name:")
        val first = input.nextLine()
        println("Enter your last name: ")
        val last = input.nextLine()
        println("Enter your email address: ")
        val email = input.nextLine()
        println("Enter a password: ")
        val password = input.nextLine()
        println("Confirm your password: ")
        val password2 = input.nextLine()

        val userData = first + " " + last + "\n" + email + "\n" + password2
        //if(password == password2){
        println("\n" + userData)
        // }
        // else{
        //     System.out.println("Your password didn't match. Please re-confirm your password: ");
        //     String reconfirm = input.nextLine();
        //     String userData2 = first + "" + "" + last + "" + email + "" + reconfirm;
        //     System.out.println(userData2);

        // }

    }

}
