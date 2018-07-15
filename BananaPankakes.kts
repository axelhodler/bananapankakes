#!/usr/bin/env kscript
@file:DependsOn("org.yaml:snakeyaml:1.21")

import org.yaml.snakeyaml.Yaml

if (args.size != 1) {
    kotlin.system.exitProcess(-1)
}
Yaml().load<String>(java.io.File(args[0]).readText())
