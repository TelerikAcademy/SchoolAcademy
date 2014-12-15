namespace CodeFirst.Data
{
    using System.Data.Entity.ModelConfiguration;

    using CodeFirst.Models;

    public class TagMappings : EntityTypeConfiguration<Tag>
    {
        public TagMappings()
        {
            this.HasKey(x => x.TagId);
            this.Property(x => x.Text).IsUnicode(true);
            this.Property(x => x.Text).HasMaxLength(255);
        }
    }
}