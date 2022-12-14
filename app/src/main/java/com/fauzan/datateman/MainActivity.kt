package com.fauzan.datateman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val menuText = arrayOf("Teman", "GitHub", "Profil")
    val menuIcon = arrayOf(R.drawable.home, R.drawable.add, R.drawable.profile)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter);
        TabLayoutMediator(tab_layout, view_pager,
            TabLayoutMediator.TabConfigurationStrategy{ tab, position ->
                tab.text=menuText[position]
                tab.icon=ResourcesCompat.getDrawable(resources, menuIcon[position], null)
            } ).attach()
    }
}