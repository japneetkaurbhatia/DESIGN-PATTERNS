package dependencyInversion;

public class Dependency {

    public class BusinessLogicLayer {
        private final DependentLayer DAL;
        BusinessLogicLayer(DependentLayer dependentLayer) {
            DAL = dependentLayer;
        }

        public void Save(Object details) {
            DAL.Save(details);
        }
    }

    public interface DependentLayer {
        void Save(Object details);
    }

    public class DataAccessLayer implements DependentLayer {
        public void Save(Object details) {

        }
    }
}