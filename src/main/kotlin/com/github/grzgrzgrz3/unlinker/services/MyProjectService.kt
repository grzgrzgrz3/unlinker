package com.github.grzgrzgrz3.unlinker.services

import com.github.grzgrzgrz3.unlinker.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
