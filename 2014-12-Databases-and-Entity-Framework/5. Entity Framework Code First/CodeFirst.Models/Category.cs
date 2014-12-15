namespace CodeFirst.Models
{
    using System.Collections.Generic;

    public class Category
    {
        private ICollection<Post> posts;

        public Category()
        {
            this.posts = new HashSet<Post>();
        }

        public int CategoryId { get; set; }

        public string Name { get; set; }
        
        public int ParentId { get; set; }

        public Category Parent { get; set; }

        public virtual ICollection<Post> Posts
        {
            get { return this.posts; }
            set { this.posts = value; }
        }
    }
}
