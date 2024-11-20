package com.directi.training.ocp.exercise_refactored;

public interface Resource {
    boolean isFreeResource(int resourceId);
    void markResourceBusy(int resourceId);
    void markResourceFree(int resourceId);
}
