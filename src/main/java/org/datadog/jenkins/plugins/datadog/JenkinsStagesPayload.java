package org.datadog.jenkins.plugins.datadog;

public class JenkinsStagesPayload {
    private String stageName;
    private Result result;
    private long durationMilliSecond;

    public String getStageName() {
        return stageName;
    }

    public Result getResult() {
        return result;
    }

    public long getDurationMilliSecond() {
        return durationMilliSecond;
    }

    private JenkinsStagesPayload() {

    }

    public static class Builder {
        private String stageName;
        private Result result;
        private long durationMilliSecond;

        public Builder stageName(String stageName) {
            this.stageName = stageName;
            return this;
        }

        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public Builder durationMilliSecond(long durationMilliSecond) {
            this.durationMilliSecond = durationMilliSecond;
            return this;
        }

        public JenkinsStagesPayload build() {
            JenkinsStagesPayload jenkinsStagesPayload = new JenkinsStagesPayload();
            jenkinsStagesPayload.stageName = this.stageName;
            jenkinsStagesPayload.result = this.result;
            jenkinsStagesPayload.durationMilliSecond = this.durationMilliSecond;

            return jenkinsStagesPayload;
        }
    }

    public enum Result {
        FAILURE,
        SUCCESS,
    }
}
