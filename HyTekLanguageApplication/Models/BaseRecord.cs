﻿namespace HyTekLanguageApplication.Models
{
    using System;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;

    /// <summary>
    /// Represents the abstract base record for all database records.
    /// </summary>
    public abstract class BaseRecord : IRecord
    {
        /// <inheritdoc />
        [Key]
        public Guid Id { get; set; } = Guid.NewGuid();

        /// <inheritdoc />
        [Required]
        [DatabaseGenerated(DatabaseGeneratedOption.Computed)]
        public DateTimeOffset InsertedDate { get; set; } = DateTimeOffset.Now;

        /// <inheritdoc />
        [Required]
        [DatabaseGenerated(DatabaseGeneratedOption.Computed)]
        public DateTimeOffset UpdatedDate { get; set; } = DateTimeOffset.Now;
    }
}