@RestController
@RequestMapping("/api/rules")
@Tag(name = "Interaction Rules")
public class InteractionRuleController {

    private final RuleService ruleService;

    public InteractionRuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping
    @Operation(summary = "Create interaction rule (ADMIN)")
    public ResponseEntity<?> create(@RequestBody InteractionRule rule) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ruleService.addRule(rule));
    }

    @GetMapping
    @Operation(summary = "List rules")
    public ResponseEntity<?> list() {
        return ResponseEntity.ok(ruleService.getAllRules());
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update rule")
    public ResponseEntity<?> update(
            @PathVariable Long id,
            @RequestBody InteractionRule rule) {
        return ResponseEntity.ok(
                ruleService.updateRule(id, rule)
        );
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete rule")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        ruleService.deleteRule(id);
        return ResponseEntity.noContent().build();
    }
}
