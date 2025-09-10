import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val textViewWelcome = findViewById<TextView>(R.id.textViewWelcome)
        val buttonSettings = findViewById<Button>(R.id.buttonSettings)

        // Receba o Intent que iniciou esta Activity
        val intent = intent

        // Obtenha o nome do usuário passado pela Activity anterior
        val userName = intent.getStringExtra("USER_NAME")

        // Exiba a mensagem personalizada
        if (!userName.isNullOrEmpty()) {
            textViewWelcome.text = "Bem-vindo, $userName!"
        }

        buttonSettings.setOnClickListener {
            // Crie um Intent para iniciar a SettingsActivity
            val settingsIntent = Intent(this, SettingsActivity::class.java)

            // Inicie a SettingsActivity
            startActivity(settingsIntent)
        }
    }
}