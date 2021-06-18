package com.github.shichaoma.testplugin.services

import com.github.shichaoma.testplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
