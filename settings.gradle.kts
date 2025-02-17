rootProject.name = "bbangglu"


File(rootDir, "bbangglu-bbangca").listFiles { file ->
    file.isDirectory && file.name.matches(
        Regex("bbangca.*")
    )
}?.forEach { dir ->
    println(dir.name)
    include("bbangglu-bbangca:${dir.name}")
}


File(rootDir, "bbangglu-pengin").listFiles { file ->
    file.isDirectory && file.name.matches(
        Regex("pengin.*")
    )
}?.forEach { dir ->
    include("bbangglu-pengin:${dir.name}")
}