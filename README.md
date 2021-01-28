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
