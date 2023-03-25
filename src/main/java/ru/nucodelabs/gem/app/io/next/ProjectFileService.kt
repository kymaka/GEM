package ru.nucodelabs.gem.app.io.next

import java.io.File

interface ProjectFileService<T> {
    fun loadProject(file: File): Project<T>
    fun saveProject(file: File, project: Project<T>)
    fun lastSavedProject(): Project<T>?
    fun lastSavedProjectFile(): File?
}