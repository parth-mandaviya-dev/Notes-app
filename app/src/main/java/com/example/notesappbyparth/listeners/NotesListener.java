package com.example.notesappbyparth.listeners;

import com.example.notesappbyparth.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
