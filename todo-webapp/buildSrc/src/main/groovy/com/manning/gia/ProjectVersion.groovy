package com.manning.gia

class ProjectVersion {
    final String major
    final String minor
    final String fix
    final String build

    ProjectVersion(String major, String minor, String fix, String build) {
        this.major = major
        this.minor = minor
        this.fix = fix
        this.build = build
    }

    @Override
    String toString() {
        String fullVersion = "$major.$minor"

        if (fix) {
            fullVersion += ".$fix"
        }

        fullVersion
    }
}
