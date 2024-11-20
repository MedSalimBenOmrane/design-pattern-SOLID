package com.directi.training.ocp.exercise_refactored;
public class SpaceSlotStrategy implements ResourceStrategy {
    @Override
    public int markResourceBusy(int resourceId) {
        // Logique pour marquer un espace comme occupé
        return resourceId;
    }

    @Override
    public void markResourceFree(int resourceId) {
        // Logique pour libérer un espace
    }

    @Override
    public int findFreeResource() {
        // Trouver un espace libre
        return 0;  // Supposons que 0 est un ID valide pour la démonstration
    }
}