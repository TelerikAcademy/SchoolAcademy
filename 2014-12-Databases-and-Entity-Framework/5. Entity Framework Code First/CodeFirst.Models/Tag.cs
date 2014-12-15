namespace CodeFirst.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;

    [Table("Tags")]
    public class Tag
    {
        private ICollection<Post> posts;

        public Tag()
        {
            this.posts = new HashSet<Post>();
        }

        [Key, Column("PostTagId")]
        public int TagId { get; set; }

        public string Text { get; set; }

        public virtual ICollection<Post> Posts
        {
            get { return this.posts; }
            set { this.posts = value; }
        }

        [Timestamp, ConcurrencyCheck]
        public byte[] RowVersion { get; set; }
    }
}
