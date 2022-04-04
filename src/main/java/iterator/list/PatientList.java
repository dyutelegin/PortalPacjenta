package iterator.list;

import iterator.EntitiesIterator;
import iterator.entity.PatientEntity;

import java.util.ArrayList;
import java.util.List;

public class PatientList implements EntitiesList {

    private final List<PatientEntity> patients = new ArrayList<>();

    public PatientList(List<PatientEntity> patients) {
        this.patients.addAll(patients);
    }

    @Override
    public PatientIterator createIterator(int step) {
        return new PatientIterator(step);
    }

    public class PatientIterator implements EntitiesIterator {

        private int current = 0;
        private final int step;

        public PatientIterator(int step) {
            this.step = step;
        }

        @Override
        public PatientEntity first() {
            current = 0;
            return patients.get(current);
        }

        @Override
        public PatientEntity next() {
            if (done()) {
                return null;
            }

            var patient = patients.get(current);
            current += step;
            return patient;
        }

        @Override
        public boolean done() {
            return current >= patients.size();
        }

        @Override
        public PatientEntity current() {
            return patients.get(current);
        }

    }

}
