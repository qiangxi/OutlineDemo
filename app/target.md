### outline目标
- 如何添加阴影的
- 阴影是否会占用实际view空间（影响其他view的布局） 【不会】
- 控制阴影形状（矩形、圆形、圆角、椭圆） 【可以】
- 阴影大小，颜色，渐变等 【颜色和渐变不可做】
- 内嵌阴影&外圈阴影【内嵌做不了】
- Android中设置阴影的方式有哪些
- 动态控制阴影（translationZ） 【可以】
- 阴影的方向（只让某些方向上有阴影）【可以】

---
- outline 实现的阴影不占用实际的view空间











>  android:elevation=""
              android:shadowColor=""
              android:shadowDx=""
              android:shadowDy=""
              android:shadowRadius=""
              android:translationZ=""

> setElevation()方法或者android:elevation=""属性都可以让view产生默认阴影效果，
但所在view必须设置一个background才能显示出阴影，background可以是一张图片或者一个drawable文件，甚至是一个颜色值，
只要有背景就可以显示出阴影【不管是一张图片或者一个drawable文件还是是一个颜色值，最终都会被包装成一个drawable对象】


###  Elevation + background 实现阴影
默认四周都有阴影
优点：
- 使用极其简单
- 可调整阴影大小（使用Elevation）
- 阴影形状根据background的形状自动适应，比如background是圆形，则阴影也是圆形
缺点：
- 不可以改变阴影方向

###  Elevation + background + outline 实现阴影
优点：
- 使用简单
- 可调整阴影大小（使用Elevation）
- 阴影形状根据background的形状自动适应，比如background是圆形，则阴影也是圆形
- 可以改变阴影方向
缺点：暂无

### 结论
目前Android中，可以做的阴影效果
可以做：
- 设置阴影大小
- 设置阴影方向
- 设置阴影形状（借助outline）
- 动态控制阴影
```
   <LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@android:color/white"
        android:orientation="vertical">

        <TextView
            android:layout_width="200dp"
            android:layout_height="40dp"
            android:layout_gravity="center"
            android:layout_marginTop="30dp"
            android:background="@drawable/shape_bg"
            android:elevation="10dp"
            android:gravity="center"
            android:text="ShapeDrawable"/>

        <TextView
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:layout_gravity="center"
            android:layout_marginTop="30dp"
            android:background="@drawable/shape_circle_bg"
            android:elevation="10dp"
            android:gravity="center"
            android:text="ShapeDrawable"/>

        <TextView
            android:layout_width="200dp"
            android:layout_height="40dp"
            android:layout_gravity="center"
            android:layout_marginTop="30dp"
            android:background="@android:color/holo_orange_dark"
            android:elevation="10dp"
            android:gravity="center"
            android:text="Color"/>

        <TextView
            android:layout_width="200dp"
            android:layout_height="40dp"
            android:layout_gravity="center"
            android:layout_marginTop="30dp"
            android:background="@drawable/image_bg"
            android:elevation="10dp"
            android:gravity="center"
            android:text="image"/>

    </LinearLayout>
```
做不了：
- 改变阴影颜色
- view内嵌阴影


