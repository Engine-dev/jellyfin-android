package org.jellyfin.mobile.utils.extensions

import android.util.Rational
import org.jellyfin.sdk.model.api.MediaStream

val MediaStream.isLandscape: Boolean
    get() {
        val width = width
        val height = height
        return if (width != null && height != null) width >= height else true
    }

val MediaStream.aspectRational: Rational?
    get() {
        val width = width
        val height = height
        return if (width != null && height != null) Rational(width, height) else null
    }
