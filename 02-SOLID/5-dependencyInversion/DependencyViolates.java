package dependencyInversion;

public class DependencyViolates {
    public class BusinessLogicLayer {
        private final DataAccessLayer DAL;
        BusinessLogicLayer() {
            DAL = new DataAccessLayer();
        }

        public void Save(Object details) {
            DAL.Save(details);
        }
    }

    public class DataAccessLayer {
        public void Save(Object details) {

        }
    }
}
