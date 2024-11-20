package com.directi.training.ocp.exercise_refactored;

public interface ResourceStrategy {
    int markResourceBusy(int resourceId);
    void markResourceFree(int resourceId);
    int findFreeResource();
}
