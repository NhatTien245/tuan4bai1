package com.example.uthtodo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Component Logo chính cho UTH Todo
 */
@Composable
fun AppLogoIcon(
    modifier: Modifier = Modifier,
    size: Dp = 100.dp,
    backgroundColor: Color = Color.White,
    iconColor: Color = Color(0xFF2F66F6)
) {
    Box(
        modifier = modifier
            .size(size)
            .clip(RoundedCornerShape(size * 0.24f))
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(size * 0.18f),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            // Dòng 1: Checkmark trong hình tròn xanh + thanh ngang
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(size * 0.22f)
                        .clip(CircleShape)
                        .background(iconColor),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(size * 0.15f)
                    )
                }
                Spacer(modifier = Modifier.width(size * 0.08f))
                Box(
                    modifier = Modifier
                        .height(size * 0.07f)
                        .fillMaxWidth(0.75f)
                        .clip(RoundedCornerShape(50))
                        .background(iconColor)
                )
            }
            // Dòng 2: Chấm tròn + thanh ngang
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(size * 0.18f)
                        .clip(CircleShape)
                        .background(iconColor.copy(alpha = 0.4f))
                )
                Spacer(modifier = Modifier.width(size * 0.12f))
                Box(
                    modifier = Modifier
                        .height(size * 0.07f)
                        .fillMaxWidth(0.85f)
                        .clip(RoundedCornerShape(50))
                        .background(iconColor.copy(alpha = 0.4f))
                )
            }
            // Dòng 3: Chấm tròn + thanh ngang ngắn
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(size * 0.18f)
                        .clip(CircleShape)
                        .background(iconColor.copy(alpha = 0.4f))
                )
                Spacer(modifier = Modifier.width(size * 0.12f))
                Box(
                    modifier = Modifier
                        .height(size * 0.07f)
                        .fillMaxWidth(0.55f)
                        .clip(RoundedCornerShape(50))
                        .background(iconColor.copy(alpha = 0.4f))
                )
            }
        }
    }
}

/**
 * Header chứa Logo + Tên ứng dụng UTH Todo
 */
@Composable
fun AppHeaderLogo(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        // Logo nhỏ góc trên bên trái
        AppLogoIcon(
            size = 32.dp,
            backgroundColor = Color(0xFF2F66F6),
            iconColor = Color.White
        )
        Spacer(modifier = Modifier.width(8.dp))
        Row {
            Text(
                text = "UTH ",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2F66F6)
            )
            Text(
                text = "Todo",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1E293B)
            )
        }
    }
}

/**
 * Minh họa bước 1: Mọi việc, gọn trong một chỗ
 */
@Composable
fun OnboardingIllustrationPage1() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFFF0F4FF)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.75f)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .border(1.dp, Color(0xFFE2E8F0), RoundedCornerShape(16.dp))
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // Mục 1: Đã hoàn thành (Checked)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(22.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF2F66F6)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(14.dp)
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Box(
                    modifier = Modifier
                        .height(10.dp)
                        .weight(1f)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color(0xFFE2E8F0))
                )
            }
            // Mục 2: Chưa hoàn thành
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(22.dp)
                        .border(2.dp, Color(0xFFCBD5E1), CircleShape)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Box(
                    modifier = Modifier
                        .height(10.dp)
                        .weight(1f)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color(0xFFE2E8F0))
                )
            }
            // Mục 3: Chưa hoàn thành
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(22.dp)
                        .border(2.dp, Color(0xFFCBD5E1), CircleShape)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Box(
                    modifier = Modifier
                        .height(10.dp)
                        .weight(1f)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color(0xFFE2E8F0))
                )
            }
        }
    }
}

/**
 * Minh họa bước 2: Chia theo Học tập và Cuộc sống
 */
@Composable
fun OnboardingIllustrationPage2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFFF0F4FF)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .border(1.dp, Color(0xFFE2E8F0), RoundedCornerShape(16.dp))
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Nhóm Học tập
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFFE0E7FF))
                    .padding(vertical = 12.dp, horizontal = 16.dp)
            ) {
                Text(
                    text = "Học tập",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2F66F6)
                )
            }
            // Nhóm Cuộc sống
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFFFFEDD5))
                    .padding(vertical = 12.dp, horizontal = 16.dp)
            ) {
                Text(
                    text = "Cuộc sống",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFEA580C)
                )
            }
        }
    }
}

/**
 * Minh họa bước 3: Nhắc đúng lúc
 */
@Composable
fun OnboardingIllustrationPage3() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFFF0F4FF)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Biểu tượng Chuông thông báo
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFE0E7FF)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = null,
                    tint = Color(0xFF2F66F6),
                    modifier = Modifier.size(32.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Thẻ nhắc nhở
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White)
                    .border(1.dp, Color(0xFFE2E8F0), RoundedCornerShape(12.dp))
                    .padding(horizontal = 20.dp, vertical = 10.dp)
            ) {
                Text(
                    text = "Ôn bài Toán lúc 19:00",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1E293B)
                )
            }
        }
    }
}
