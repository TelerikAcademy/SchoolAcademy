using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DemoModels
{
    public class Location
    {
        public double Latitude { get; set; }
        public double Longitude { get; set; }

        public Location()
            : this(0, 0)
        {

        }

        public Location(double latitude, double longitude)
        {
            this.Latitude = latitude;
            this.Longitude = longitude;
        }
        public override string ToString()
        {
            return string.Format("Latitude: {0}, Longitude: {1}", Latitude, Longitude);
        }

        public override int GetHashCode()
        {
            unchecked
            {
                int result = 17;
                result = result * 23 + this.Latitude.GetHashCode();
                result = result * 23 + this.Longitude.GetHashCode();
                return result;
            }
        }

        public bool Equals(Location value)
        {
            if (ReferenceEquals(null, value))
            {
                return false;
            }
            if (ReferenceEquals(this, value))
            {
                return true;
            }
            return this.Latitude == value.Latitude &&
                   this.Longitude == value.Longitude;
        }

        public override bool Equals(object obj)
        {
            Location temp = obj as Location;
            if (temp == null)
                return false;
            return this.Equals(temp);
        }
    }
}
