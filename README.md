CalendarTwoWayscroll
===================================

>Cuatom View like grid that is scrollable in both direction.


How to use
--------------
Set in your xml 
```xml
 <co.faisal.customtwowayscroll.TableFixHeaders
        android:id="@+id/table"
        android:layout_width="match_parent"
        android:background="@color/backgroundGray"
        android:layout_height="match_parent" />
```
   
   
then initialized data list 
```java 
List <String >headers= new ArrayList<>();
headers.add("");
headers.add("2BR");
headers.add("1SK");
headers.add("1BR");
headers.add("STU");
headers.add("HU");
headers.add("HUS");
headers.add("KKL");

List<String > list= new ArrayList<>();
list.add(new String[]{"1","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"2","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"3","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"4","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"5","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"6","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"7","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"8","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"9", "AVL", "WL", "NE", "NE", "AVL", "AVL","AVL"});
list.add(new String[]{"10", "AVL", "WL", "NE", "NE", "AVL", "AVL","AVL"});
list.add(new String[]{"11","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"12","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"13","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"14","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"15","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"16","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"17","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"18","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"19","AVL","WL","NE","NE","AVL","AVL","AVL"});
list.add(new String[]{"20", "AVL", "WL", "NE", "NE", "AVL", "AVL","AVL"});
```
Then create adapter an use  
   
Set in parent of your layout 
```java
TableFixHeaders tableFixHeaders = (TableFixHeaders) findViewById(R.id.table);
DisplayMetrics displaymetrics = new DisplayMetrics();
getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
int itemHW = (displaymetrics.widthPixels*15)/100;
int headerH = (displaymetrics.widthPixels*10)/100;
BaseTableAdapter baseTableAdapter = new CustomTableAdapter(this,list,headers,headerH,itemHW, new ICallback() {
   @Override
   public void onClick(String date) {
         Toast.makeText(MainActivity.this, date, Toast.LENGTH_SHORT).show();
      }
   });
   tableFixHeaders.setAdapter(baseTableAdapter);
```

 
Screenshots
--------------
![device-2016-07-16-043343](https://cloud.githubusercontent.com/assets/7554816/16890699/8f08269c-4b0e-11e6-9d2a-faf075c7b9aa.png)


