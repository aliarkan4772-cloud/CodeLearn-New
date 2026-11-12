package com.codelearn.app.data.model

import androidx.compose.ui.graphics.Color
import com.codelearn.app.ui.theme.CppBlue
import com.codelearn.app.ui.theme.CppCyan
import com.codelearn.app.ui.theme.HtmlOrange
import com.codelearn.app.ui.theme.JsAmber
import com.codelearn.app.ui.theme.JsYellow
import com.codelearn.app.ui.theme.PythonBlue
import com.codelearn.app.ui.theme.PythonYellow

/**
 * A supported programming language. Adding a new language = adding one entry here
 * (plus its roadmap JSON in Module 4 and its runner in the backend).
 */
enum class Language(
    val id: String,
    val displayName: String,
    val tagline: String,
    val accent: Color,
    val accentSecondary: Color,
    val badge: String,
    val isClientRendered: Boolean = false
) {
    PYTHON(
        id = "python",
        displayName = "Python",
        tagline = "شروع آسان، قدرت بالا",
        accent = PythonBlue,
        accentSecondary = PythonYellow,
        badge = "PY"
    ),
    JAVASCRIPT(
        id = "javascript",
        displayName = "JavaScript",
        tagline = "زبان وب و اپلیکیشن",
        accent = JsYellow,
        accentSecondary = JsAmber,
        badge = "JS"
    ),
    CPP(
        id = "cpp",
        displayName = "C++",
        tagline = "سرعت و کنترل کامل",
        accent = CppBlue,
        accentSecondary = CppCyan,
        badge = "C++"
    ),
    HTML_CSS(
        id = "html",
        displayName = "HTML / CSS",
        tagline = "ساخت رابط‌های وب",
        accent = HtmlOrange,
        accentSecondary = JsAmber,
        badge = "</>",
        isClientRendered = true
    );

    companion object {
        fun fromId(id: String?): Language =
            entries.firstOrNull { it.id == id } ?: PYTHON
    }
}
