<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".task2">

    <TextView
        android:id="@+id/login_word"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:text="Login"
        android:textAppearance="?android:attr/textAppearanceLarge"
        tools:layout_editor_absoluteX="162dp"
        tools:layout_editor_absoluteY="154dp" />

    <TextView
        android:id="@+id/username"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="16dp"
        android:text="Username"
        android:textColor="#000000"
        android:textSize="20sp"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="231dp" />

    <TextView
        android:id="@+id/password"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/username"
        android:text="password"
        android:textColor="#000000"
        android:textSize="20sp"
        tools:layout_editor_absoluteX="19dp"
        tools:layout_editor_absoluteY="316dp" />

    <EditText
        android:id="@+id/edit_username"
        android:layout_width="fill_parent"
        android:layout_height="40dp"
        android:layout_toRightOf="@id/username"
        android:hint="UserName"
        tools:layout_editor_absoluteX="65dp"
        tools:layout_editor_absoluteY="276dp" />

    <EditText
        android:id="@+id/edit_password"
        android:layout_width="fill_parent"
        android:layout_height="40dp"
        android:layout_below="@id/edit_username"
        android:layout_toRightOf="@id/password"
        android:hint="password"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:layout_editor_absoluteX="88dp" />

    <Button
        android:id="@+id/login_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/edit_password"
        android:layout_centerHorizontal="true"
        android:background="#03B424"
        android:text="SignIn"
        android:textColor="#ffffff"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="390dp" />

</androidx.constraintlayout.widget.ConstraintLayout>
