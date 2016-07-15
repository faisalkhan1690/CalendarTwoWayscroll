CalendarTwoWayscroll
===================================

>Cuatom View like grid that is scrollable in both direction.


How to use
--------------
Set
```xml
android:indeterminateDrawable="@drawable/unselected_star"
```
   unselected_star is the unselected drawable
   
Set 
```xml 
android:progressDrawable="@drawable/rating_stars"
```
   rating_stars is the selector drawable
   
Set in parent of your layout 
```xml 
xmlns:rating_bar_custom="http://schemas.android.com/apk/res-auto"
```
   
Set number of stars in 
```xml 
rating_bar_custom:customNumStars 
``` 
instead of  
```xml 
android:numStars 
```

Example 
--------------
```xml
 <com.example.faisalkhan.customratingbarlib.RatingBarCustom
      android:id="@+id/rating_bar_custom"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:indeterminateDrawable="@drawable/unselected_star"
      android:progressDrawable="@drawable/rating_stars"
      rating_bar_custom:customNumStars="5" />
```
 
Screenshots
--------------
![device-2016-07-16-043343](https://cloud.githubusercontent.com/assets/7554816/16890699/8f08269c-4b0e-11e6-9d2a-faf075c7b9aa.png)


