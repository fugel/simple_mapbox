package co.uk.fugel.simplemapbox

import android.os.Build
import android.view.View
import android.view.Window

import android.view.WindowManager


fun setWindowStatusNav(
    window: Window,
    statusbarColor: Int,
    navbarColor: Int
) {
    val flags =
        WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS or WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION
    val uiVisibility: Int =
        View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
    window.decorView.systemUiVisibility = uiVisibility
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        window.attributes.flags = window.attributes.flags and flags.inv()
        window.statusBarColor = statusbarColor
        window.navigationBarColor = navbarColor
    }
}
