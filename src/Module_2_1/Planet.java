package Module_2_1;

public class Planet {
        private String designation;
        private double massKg;
        private double orbitEarthYears;
        private PlanetType type;

        public Planet(String designation, PlanetType type){
            this.designation = designation;
            this.type = type;
        }

        public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) {
            this.designation = designation;
            this.massKg = massKg;
            this.orbitEarthYears = orbitEarthYears;
            this.type = type;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Planet) {
            Planet other = (Planet) obj;
            if(this.designation.equals(other.designation))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return designation.hashCode();
    }

    @Override
    public String toString() {
        return "Planet: \n" + " - Designation: " + designation + "\n - Type: " + type;
    }
}
    