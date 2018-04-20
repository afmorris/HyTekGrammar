namespace HyTekLanguageApplication.Models
{
    using System;

    /// <summary>
    /// The Database Record interface.
    /// </summary>
    public interface IRecord
    {
        /// <summary>
        /// Gets or sets the record's identifier.
        /// </summary>
        Guid Id { get; set; }

        /// <summary>
        /// Gets or sets the inserted date.
        /// This is a computed field.
        /// </summary>
        DateTimeOffset InsertedDate { get; set; }

        /// <summary>
        /// Gets or sets the updated date.
        /// This is a computed field.
        /// </summary>
        DateTimeOffset UpdatedDate { get; set; }
    }
}