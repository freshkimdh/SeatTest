package com.murgupluoglu.seatview

import android.content.res.Resources
import android.graphics.Color
import androidx.annotation.ColorInt

/*
*  Created by Mustafa Ürgüplüoğlu on 13.03.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/

data class SeatViewConfig(
    
    // 페이지 패딩
    var leftPadding: Float = 50f,
    var rightPadding: Float = 50f,
    var topPadding: Float = 50f,
    var bottomPadding: Float = 50f,

    var seatMinWidth: Float = 12f.dp2px(),
    var seatMaxWidth: Float = 30f.dp2px(),
    var seatDefaultWidth: Float = 20f.dp2px(), // 좌석 width 조정
    var seatWidthHeightRatio: Float = 1f,
    var seatInlineGapWidthRatio: Float = 0.265f, // 좌석 column 간격 gap 조정
    var seatNewlineGapWidthRatio: Float = 0.904f, // 좌석 row 간격 gap 조정

    @ColorInt
    var backgroundColor: Int = Color.GRAY,
    var isZoomActive: Boolean = true,

    )

fun Float.dp2px(): Float {
    val scale: Float = Resources.getSystem().displayMetrics.density
    return (this * scale + 0.5f)
}