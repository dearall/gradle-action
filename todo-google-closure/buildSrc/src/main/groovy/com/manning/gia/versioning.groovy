package com.manning.gia

import org.gradle.api.GradleException

ext.versionFile = file('version.properties')

project.version = readVersion()

ProjectVersion readVersion() {
    logger.quiet 'Reading the version file.'

    if (!versionFile.exists()) {
        throw new GradleException("Required version file does not exit: $versionFile.canonicalPath")
    }

    Properties versionProps = new Properties()

    versionFile.withInputStream { stream ->
        versionProps.load(stream)
    }

    // System.env.SOURCE_BUILD_NUMBER 由 jenkins CI 构建提供，开发机上值为空
    new ProjectVersion(versionProps.version_major.toString(), versionProps.version_minor.toString(),
            versionProps.version_fix.toString(), System.env.SOURCE_BUILD_NUMBER)
}

// 记录构建时间
ext.buildTimestamp = new Date().format('yyyy-MM-dd HH:mm:ss')

