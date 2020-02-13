package com.kotlin.mvvmkotlink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.kotlin.mvvmkotlink.basefragment.replaceFragmenty
import com.kotlin.mvvmkotlink.fragment.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var homeFragment: HomeFragment
    private lateinit var notificationFragment: NotificationFragment
    private lateinit var movieFragment: MovieFragment
    private lateinit var noteFragment: NoteFragment
    private lateinit var workFragment: WorkFragment
    private lateinit var settingFragment: SettingFragment
    private lateinit var accountFragment: AccountFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolBar)
        val actionBar = supportActionBar
        actionBar?.title = "Navigation Drawer"
        val drawerToggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawerLayout, toolBar, (R.string.open), (R.string.close)
        ) {
        }
        drawerToggle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
        nav_main.setNavigationItemSelectedListener(this)
        //
        homeFragment = HomeFragment()
        notificationFragment = NotificationFragment()
        movieFragment = MovieFragment()
        noteFragment = NoteFragment()
        workFragment = WorkFragment()
        settingFragment = SettingFragment()
        accountFragment = AccountFragment()
        replaceFragmenty(homeFragment, true, R.id.frm_layout)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                replaceFragmenty(homeFragment, true, R.id.frm_layout)
            }
            R.id.notifi -> {
                replaceFragmenty(notificationFragment, true, R.id.frm_layout)
            }
            R.id.movie -> {
                replaceFragmenty(movieFragment, true, R.id.frm_layout)
            }
            R.id.notes -> {
                replaceFragmenty(noteFragment, true, R.id.frm_layout)
            }
            R.id.work -> {
                replaceFragmenty(workFragment, true, R.id.frm_layout)
            }
            R.id.setting -> {
                replaceFragmenty(settingFragment, true, R.id.frm_layout)
            }
            R.id.account -> {
                replaceFragmenty(accountFragment, true, R.id.frm_layout)
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
