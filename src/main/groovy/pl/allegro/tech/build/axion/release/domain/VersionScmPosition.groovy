package pl.allegro.tech.build.axion.release.domain

class VersionScmPosition {

    final String revision

    final String shortRevision

    final String branch

    VersionScmPosition(String revision, String shortRevision, String branch) {
        this.revision = revision
        this.shortRevision = shortRevision
        this.branch = branch
    }

    @Override
    public String toString() {
        return "VersionScmPosition[revision = $revision, shortRevision = $shortRevision, branch = $branch]"
    }

}
