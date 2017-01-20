# DrawableTextView
自定义控件 ：drawable 跟随TextView居中  
The drawable follows the text centered

截图：
----------

![DrawableTextView](https://github.com/niniloveyou/DrawableTextView/blob/master/drawableTextView.jpeg)

###Manually

你只需要这添加这两个文件就可以使用了！
   + deadline/DrawableTextView.java
   + res/values/attrs.xml

###代码中这样设置即可
```
drawable = ContextCompat.getDrawable(getContext(), R.mipmap.xxx);
setDrawable(DrawableTextView.LEFT, drawable, width, height);
```

Customizable attributes

### xml中定义了以下属性
-  Define `xmlns:app="http://schemas.android.com/apk/res-auto"` on root of your xml file

```xml
<deadline.DrawableTextView
            android:layout_width="100dp"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            
            android:drawablePadding="5dp"
            
            app:bottomDrawable="@mipmap/camera"
            app:bottomDrawableHeight="20dp"
            app:bottomDrawableWidth="20dp"
            
            app:leftDrawable="@mipmap/camera"
            app:leftDrawableHeight="20dp"
            app:leftDrawableWidth="20dp"
            
            app:rightDrawable="@mipmap/camera"
            app:rightDrawableHeight="20dp"
            app:rightDrawableWidth="20dp"
            
            app:topDrawable="@mipmap/camera"
            app:topDrawableHeight="20dp"
            app:topDrawableWidth="20dp"/>
```



Developed By
-------
deadline

Blog :   http://www.jianshu.com/users/25e80ace21b8/latest_articles
