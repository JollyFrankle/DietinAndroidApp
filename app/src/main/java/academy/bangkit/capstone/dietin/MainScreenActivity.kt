package academy.bangkit.capstone.dietin

import academy.bangkit.capstone.dietin.databinding.ActivityMainScreenBinding
import academy.bangkit.capstone.dietin.ui.search.RecipeSearchActivity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController

class MainScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val navController = findNavController(R.id.nav_host_fragment)
        binding.navView.setupWithNavController(navController)

        binding.fabSearch.setOnClickListener {
            val intent = Intent(this, RecipeSearchActivity::class.java)
            startActivity(intent)
        }
    }
}