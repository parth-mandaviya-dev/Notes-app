package com.example.notesappbyparth.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.notesappbyparth.entities.Note;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Note> getAllNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE) // this mean if id of new note is already available in the database then it will be replaced with new note and our note get updated
    void insertNote(Note note);

    @Delete
    void deleteNote(Note note);
    

}
