# Kotlin_study

## Lovetest 21/01/25
![image](https://user-images.githubusercontent.com/62757915/105697798-60b9b780-5f48-11eb-860d-84b0c0600329.png)
navigation 와 fragment의 개념에 대해 많이 학습하였다.

> build.gradle 파일의 dependencies에 추가
```
// Kotlin
  implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
  implementation "androidx.navigation:navigation-ui-ktx:$nav_version"
```
> activity_main.xml에 추가
```
<fragment
        android:id="@+id/nav_host_fragment"
        android:name="androidx.navigation.fragment.NavHostFragment"
        android:layout_width="0dp"
        android:layout_height="0dp"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:defaultNavHost="true"
        app:navGraph="@navigation/nav_graph"/>
```
## Login & Register 21/01/28
![image](https://user-images.githubusercontent.com/62757915/106088581-97bae380-6169-11eb-9acd-4652811d6439.png)
![image](https://user-images.githubusercontent.com/62757915/106088611-a5706900-6169-11eb-978f-ed11fc541da2.png)
![image](https://user-images.githubusercontent.com/62757915/106088629-adc8a400-6169-11eb-84b6-eabc394d2f62.png)
DB - php - Kotlin 간의 상호작용에 대해 이해하였다
