namespace CodeFirst.Models
{
    public class PostAnswer
    {
        public int PostAnswerId { get; set; }

        public string Content { get; set; }

        public int PostId { get; set; }

        public virtual Post Post { get; set; }
    }
}
